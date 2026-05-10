# TopCommand

A simple Paper plugin that teleports you to the surface with `/top`.

## Features

- Instantly teleport to the highest block at your current X/Z position
- Preserves your look direction
- Permission support

## Requirements

- Paper 1.21+
- Java 21+

## Installation

1. Download the latest `top-plugin.jar` from [Releases](https://github.com/choiisgood/topcommand/releases)
2. Drop it into your server's `plugins/` folder
3. Restart the server

## Usage

| Command | Description |
|---------|-------------|
| `/top`  | Teleport to the surface at your current position |

## Permissions

| Permission       | Description          | Default |
|------------------|----------------------|---------|
| `topplugin.top`  | Allows use of `/top` | Everyone |

## Building from Source

```bash
git clone https://github.com/choiisgood/topcommand.git
cd topcommand
mvn package
```

Output jar will be in `target/`.
