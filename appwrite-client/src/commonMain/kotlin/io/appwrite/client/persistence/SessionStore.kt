package io.appwrite.client.persistence

/**
 * Platform-specific session persistence.
 * On Android: SharedPreferences
 * On iOS: UserDefaults
 * On JVM: java.util.prefs.Preferences
 */
expect class SessionStore(identifier: String = "APPWRITE") {
    fun save(key: String, value: String)
    fun load(key: String): String?
    fun remove(key: String)
    fun clear()
}
