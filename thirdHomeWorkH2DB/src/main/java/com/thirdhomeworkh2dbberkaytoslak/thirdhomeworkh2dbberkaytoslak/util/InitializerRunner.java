package com.thirdhomeworkh2dbberkaytoslak.thirdhomeworkh2dbberkaytoslak.util;

import com.thirdhomeworkh2dbberkaytoslak.thirdhomeworkh2dbberkaytoslak.entity.User;
import com.thirdhomeworkh2dbberkaytoslak.thirdhomeworkh2dbberkaytoslak.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(User.builder().name("Berkay").age(23).email("berkay@berk.com").build());
        repository.save(User.builder().age(35).name("Ceren").email("ceren@ceren.com").build());
        repository.save(User.builder().age(56).name("alp").email("alp@alp.com").build());
        repository.save(User.builder().age(22).name("Aslı").email("aslı@aslı.com").build());

        repository.findAll().forEach(user -> logger.info("{}", user));

    }
}
