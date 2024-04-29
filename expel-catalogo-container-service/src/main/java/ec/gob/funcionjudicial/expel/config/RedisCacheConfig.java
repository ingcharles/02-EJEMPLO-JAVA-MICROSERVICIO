package ec.gob.funcionjudicial.expel.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.spring.cache.CacheConfig;
import org.redisson.spring.cache.RedissonSpringCacheManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableCaching
public class RedisCacheConfig {

  private static final String MATERIAS_CACHE = "materias";
  private static final String TIPO_DOCUMENTO_CACHE = "tipoDocumento";
  private static final String TIPO_ACCION_CACHE = "tipoAccion";
  private static final String DELITOS_CACHE = "delitos";
  private static final Integer MINUTES_EXPIRES_MATERIA = 720;

  @Value("${redis.address}")
  private String redisAddress;

  @Bean
  @Profile("dev")
  public CacheManager cacheManager() {
    CaffeineCacheManager cacheManager = new CaffeineCacheManager();
    cacheManager.setCaffeine(
        Caffeine.newBuilder()
            .maximumSize(2000)
            .expireAfterAccess(MINUTES_EXPIRES_MATERIA, TimeUnit.MINUTES));
    cacheManager.setCacheNames(List.of(MATERIAS_CACHE, TIPO_DOCUMENTO_CACHE, TIPO_ACCION_CACHE, DELITOS_CACHE));
    return cacheManager;
  }

  @Bean
  @Profile("prod")
  public CacheManager getCahe(RedissonClient redissonClient) {
    Map<String, CacheConfig> config = new HashMap<>();
    config.put(MATERIAS_CACHE, createCacheConfigWithTTL(24));
    config.put(TIPO_DOCUMENTO_CACHE, createCacheConfigWithTTL(24));
    return new RedissonSpringCacheManager(redissonClient, config);
  }

  private CacheConfig createCacheConfigWithTTL(int hours) {
    CacheConfig cacheConfig = new CacheConfig();
    cacheConfig.setTTL(TimeUnit.HOURS.toMillis(hours));
    return cacheConfig;
  }

  @Bean(destroyMethod = "shutdown")
  @Profile("prod")
  public RedissonClient redisson() {
    final Config config = new Config();
    config.useSingleServer().setAddress(redisAddress);
    return Redisson.create(config);
  }
}
