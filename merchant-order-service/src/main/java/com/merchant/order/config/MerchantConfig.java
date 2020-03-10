package com.merchant.order.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@Configuration
public class MerchantConfig {

	private static final String KEY = "Movie";
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	private HashOperations hashOperations;

	/*
	 * @Autowired public MerchantConfig(RedisTemplate<String, Object> redisTemplate)
	 * { this.redisTemplate = redisTemplate; }
	 */

	@PostConstruct
	public void init() {

		hashOperations = redisTemplate.opsForHash();
		hashOperations.put("movie", "hindi", "abc");
		String x = (String) hashOperations.get("movie", "hindi");
		System.out.println("value is" + x);

	}

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
		return template;
	}
}
