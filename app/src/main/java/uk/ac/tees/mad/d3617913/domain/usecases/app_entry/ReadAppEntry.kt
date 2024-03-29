package uk.ac.tees.mad.d3617913.domain.usecases.app_entry

import kotlinx.coroutines.flow.Flow
import uk.ac.tees.mad.d3617913.domain.manager.LocalUserManager

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}