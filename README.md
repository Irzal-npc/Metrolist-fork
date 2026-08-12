# Metrolist-fork — Build Guide (Agent Mode)

## Target
- Android 11 (API 30) — arm64 only
- Variant: `foss` (F-Droid compatible, no Google Play Services)
- Theme: pure black monochrome

## Build
```bash
./gradlew :app:assembleFossArm64Debug
./gradlew :app:assembleFossArm64Release
```

## Requirements
- Android Studio / Gradle
- SDK 30+ (compileSdk 36)
- NDK arm64-v8a

## What was stripped (for reference)
- Variants: only `foss` + `arm64`
- Languages: `values/` (EN) + `values-in/` (ID) only
- Features removed: lyrics, stats, widget, wrapped, system/about, privacy/proxy, appearance/theme settings, login/account, fastlane/assets
- Theme: pure black (Theme.kt forced)
- Player/MiniPlayer: new minimal design (pure black, slim slider, gesture)

## Core kept
- `app/src/main/` playback, Room DB, UI
- `innertube/` YouTube Music API
- `build.gradle.kts`: Kotlin DSL

## Notes for agent/developer
- No login/account screens remain
- No GMS/Cast
- No dynamic theme / appearance settings
- Quick picks / library sync disabled (no account)
- Download/offline via `ExoDownloadService`
