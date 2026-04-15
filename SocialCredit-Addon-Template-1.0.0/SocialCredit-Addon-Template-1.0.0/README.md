# SocialCredit Addon Template

This is the official starter template for building addons for the **SocialCredit** framework.

It exists to give addon developers a clean, supported baseline with the correct project structure already in place.

## Clone this project to start your own addon

The intended workflow is simple:

1. **Clone this repository**
2. Rename the project, package, and main class
3. Update `plugin.yml`
4. Drop your SocialCredit core jar into `libs/`
5. Start building your own addon

This template is designed to be copied and adapted into new companion plugins for the SocialCredit ecosystem.

## What this template includes

- Maven project structure
- `plugin.yml`
- MIT `LICENSE`
- Example main plugin class
- Example `SocialCreditPreChangeEvent` listener
- `BUILD.ps1` helper script
- `libs/` placeholder for the SocialCredit core jar

## Target versions

- SocialCredit core: **1.6.4**
- Java: **21**
- Paper: **1.20.4**

## Build notes

Place your core jar here:

```text
libs/SocialCredit-1.6.4.jar
```

Then build from the project root with:

```powershell
mvn clean package
```

Expected output:

```text
target/SocialCreditAddonTemplate-1.0.0.jar
```

## Rename checklist

Before using this as your own addon, update:

- project folder name
- Maven `artifactId`
- package names
- main class name
- `plugin.yml`
- README text

## Rules

- Use the public SocialCredit API only
- Do not use internal classes
- Do not access the SocialCredit database directly
- Prefer events over polling
- Treat SocialCredit as the stable dependency layer

## License

This template uses the MIT License.

You are free to clone, modify, and distribute your addon under the same terms.
