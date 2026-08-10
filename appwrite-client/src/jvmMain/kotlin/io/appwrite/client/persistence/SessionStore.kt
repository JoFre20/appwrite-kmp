package io.appwrite.client.persistence

import java.util.prefs.Preferences

actual class SessionStore actual constructor(identifier: String) {
    private val prefs = Preferences.userNodeForPackage(SessionStore::class.java)
    private val ident = identifier

    actual fun save(key: String, value: String) {
        prefs.put(key+ident, value)
    }

    actual fun load(key: String): String? = prefs.get(key+ident, null)

    actual fun remove(key: String) {
        prefs.remove(key+ident)
    }

    actual fun clear() {
        prefs.clear()
    }
}
