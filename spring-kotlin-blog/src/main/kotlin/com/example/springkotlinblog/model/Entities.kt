package com.example.springkotlinblog.model

import com.example.springkotlinblog.utils.toSlug
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "articles")
class Article(
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne var author: User,
    var slug: String = title.toSlug(),
    var addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null
)

@Entity
@Table(name = "users")
class User(
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null
)