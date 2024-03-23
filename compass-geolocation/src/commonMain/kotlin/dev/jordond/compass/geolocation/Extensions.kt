package dev.jordond.compass.geolocation

import dev.jordond.compass.Location

/**
 * Gets the current location or null if the location is not available.
 *
 * @receiver The [Geolocator] to get the location from.
 * @return The current location or null if the location is not available.
 */
public suspend fun Geolocator.currentLocationOrNull(): Location? = current().getOrNull()

/**
 * Check if the current [Geolocator] has the permissions required for geolocation.
 *
 * This will always return `true` if the [Geolocator] is not a [PermissionLocator].
 *
 * @receiver The [Geolocator] to check the permissions of.
 * @return True if the [Geolocator] has the permissions required for geolocation, false otherwise.
 */
public fun Geolocator.hasPermission(): Boolean {
    return (locator as? PermissionLocator)?.hasPermission() ?: true
}