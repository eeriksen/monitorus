package com.eivinderiksen.monitorus.model

import javax.persistence.*

@Entity
@Table(name = "app_entry")
class AppEntry {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null

    var display_name : String? = null
}