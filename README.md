[//]: # ([![]&#40;http://cf.way2muchnoise.eu/432817.svg&#41;]&#40;https://www.curseforge.com/minecraft/mc-mods/datapack-anvil&#41;)

[//]: # ([![Modrinth]&#40;https://img.shields.io/modrinth/dt/7zu3jG0v?label=modrinth&#41;]&#40;https://modrinth.com/mod/dpanvil&#41;)

[//]: # ([![Discord]&#40;https://img.shields.io/discord/726853121816526878.svg?label=&logo=discord&logoColor=ffffff&color=7389D8&labelColor=6A7EC2&#41;]&#40;https://discord.gg/BFfAmJP&#41;)

[//]: # ([![build]&#40;https://github.com/Sirttas/DataPack-Anvil/actions/workflows/build.yml/badge.svg&#41;]&#40;https://github.com/Sirttas/DataPack-Anvil/actions&#41;)

[//]: # ([![Quality Gate Status]&#40;https://sonarcloud.io/api/project_badges/measure?project=Sirttas_DataPack-Anvil&metric=alert_status&#41;]&#40;https://sonarcloud.io/dashboard?id=Sirttas_DataPack-Anvil&#41;)

# Unofficial fork of DataPack Anvil

This project is intended solely for use within the Metafactory modpack and contains differences from the official project. Due to this, direct questions and issues to Nil rather than the original author, as they are likely due to changes

DataPack Anvil is a library mod used to facilitate creation of datapack driven mods (mods storing custom data in datapack). It includs things like:

* [Data Manager](https://github.com/Sirttas/DataPack-Anvil/wiki/Data-Managers)
* [@DataHolder](https://github.com/Sirttas/DataPack-Anvil/wiki/Data-Managers#dataholder)
* [Events](https://github.com/Sirttas/DataPack-Anvil/wiki/Data-Managers#events)
* [Tags](https://github.com/Sirttas/DataPack-Anvil/wiki/Tags)
* [Serializable Block Predicates](https://github.com/Sirttas/DataPack-Anvil/wiki/Block-Predicates)

Take a look at [the wiki](https://github.com/Sirttas/DataPack-Anvil/wiki) for more info on how it works.

DataPack anvil is hosted on [ModMaven](https://modmaven.dev/) add this to your `build.gradle`:
```grouvy
repositories {
    maven { url 'https://modmaven.dev/' }
}

dependencies {
    compileOnly fg.deobf("metafact.dpanvil_m:dpanvil_m:${dpanvil_version}:api")
    runtimeOnly fg.deobf("metafact.dpanvil_m:dpanvil_m:${dpanvil_version}")
}
```

Also I recommend adding dependency in your mod.toml like so: 
```toml
[[dependencies.mymod]]
    modId="dpanvil_m"
    mandatory=true
    versionRange="[${current},${next_minor})" # example "[1.17.1-2.0.0,1.17.1-2.1.0)"
    ordering="AFTER"
    side="BOTH"
```

Support the original dev:

[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/X8X8CLYPH)

[//]: # ([![discord]&#40;https://i.imgur.com/mANW7ms.png "discord"&#41;]&#40;https://discord.gg/BFfAmJP ""&#41;)
