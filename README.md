<img width="128" height="128" alt="stfu" src="https://github.com/user-attachments/assets/165d0214-5a8a-4465-8172-cc070859c424" />

# Stfu Narrator

Stfu Narrator is a lightweight, client-side Fabric mod that skips Minecraft's Accessibility onboarding popup and disables
the Narrator hotkey (`Ctrl + B`), so it never interrupts your game again.

---

### 📥 Downloads

The latest release of **Stfu Narrator** can be downloaded from our official [Modrinth](https://modrinth.com/mod/shutup-narrator) page.

### 🖥️ Installation

1. Install [Fabric Loader](https://fabricmc.net/) for Minecraft 26.2.
2. Download **Stfu Narrator** from [Modrinth](https://modrinth.com/mod/shutup-narrator).
3. Download the matching version of [Fabric API](https://modrinth.com/mod/fabric-api).
4. Place both `.jar` files into your `.minecraft/mods` folder.
5. Launch Minecraft.

For more information, please refer to the [Fabric Installation Guide](https://fabricmc.net/use/installer/).

### 📋 Requirements

| Component     | Version     |
|---------------|-------------|
| Minecraft     | `26.2`      |
| Fabric Loader | `>= 0.19.3` |
| Fabric API    | Required    |
| Java          | `25`        |

> This release is built specifically for Minecraft 26.2.

### 💻 Client-Side Only

Stfu Narrator is strictly client-side and does not need to be installed on dedicated servers.

### 📬 Reporting Issues

If you'd like to report an issue (bug, crash, etc.) or request changes, please open an issue on the
[project issue tracker](https://github.com/Superduash/Stfu-Narrator/issues).

Include your Minecraft version, Fabric Loader version, and a description of the problem.

## ✨ Features

- **Skips Accessibility Onboarding** — Automatically skips Minecraft's Accessibility onboarding screen on first launch.
- **Disables Narrator Hotkey** — Disables the Narrator hotkey (`Ctrl + B`) to prevent accidental activation during gameplay.
- **Zero Overhead** — Makes its changes once during game initialization. No tick listeners, no persistent background threads, no config files.

## 🛠️ Building from sources

Stfu Narrator uses the [Gradle build tool](https://gradle.org/) and can be built with the `gradle build` command. The build
artifacts can be found in the `build/libs` directory.

The [Gradle wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html#sec:using_wrapper) is provided for ease
of use and will automatically download and install the appropriate version of Gradle for the project build. To use the
Gradle wrapper, substitute `gradle` in build commands with `./gradlew.bat` (Windows) or `./gradlew` (macOS and Linux).

### Build Requirements

- JDK 25
    - We recommend using the [Eclipse Temurin](https://adoptium.net/) distribution.

## 🔗 Links

- **Source Code:** [GitHub Repository](https://github.com/Superduash/Stfu-Narrator)
- **Issue Tracker:** [GitHub Issues](https://github.com/Superduash/Stfu-Narrator/issues)
- **Modrinth:** [Stfu Narrator on Modrinth](https://modrinth.com/mod/shutup-narrator)

## 👏 Credits

Inspired by the original concept behind [Disable Accessibility Screen](https://modrinth.com/mod/disable-accessibility-screen)
by **DaFuqs**.

*Stfu Narrator* is an independent implementation targeting modern Minecraft/Fabric versions.

## 📄 License

This project is licensed under the [MIT License](LICENSE).

## ⚠️ Disclaimer

Minecraft is a trademark of Mojang Studios. This project is not affiliated with, endorsed by, or associated with
Mojang Studios or Microsoft.
