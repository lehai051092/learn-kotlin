package com.example.springkotlinblog.config

import com.example.springkotlinblog.model.Article
import com.example.springkotlinblog.model.ArticleRepository
import com.example.springkotlinblog.model.User
import com.example.springkotlinblog.model.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository
    ) = ApplicationRunner {

        val johnDoe = userRepository.save(User("johnDoe", "John", "Doe"))
        articleRepository.save(
            Article(
            title = "Lorem",
            headline = "Lorem",
            content = "dolor sit amet",
            author = johnDoe
        )
        )
        articleRepository.save(
            Article(
            title = "Ipsum",
            headline = "Ipsum",
            content = "dolor sit amet",
            author = johnDoe
        )
        )
    }
}