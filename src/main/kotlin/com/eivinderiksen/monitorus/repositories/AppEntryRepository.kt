package com.eivinderiksen.monitorus.repositories

import com.eivinderiksen.monitorus.entities.AppEntry
import org.springframework.data.repository.CrudRepository

interface AppEntryRepository : CrudRepository<AppEntry, Long>