package uk.ac.tees.mad.d3617913.domain.usecases.app_entry

import uk.ac.tees.mad.d3617913.domain.manager.LocalUserManager


class SaveAppEntry(private val localUserManager: LocalUserManager) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}