[![Codacy Badge](https://api.codacy.com/project/badge/Grade/52c0a7fa26854206a17e11d781bd421c)](https://www.codacy.com/app/jelabra/Agents_e3b?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Arquisoft/Agents_e3b&amp;utm_campaign=Badge_Grade)
[![Build Status](https://travis-ci.org/Arquisoft/Agents_e3b.svg?branch=master)](https://travis-ci.org/Arquisoft/Agents_e3b)
[![Codefresh build status]( https://g.codefresh.io/api/badges/build?repoOwner=Arquisoft&repoName=Agents_e3b&branch=master&pipelineName=Agents_e3b&accountName=miguelms95&type=cf-1)]( https://g.codefresh.io/repositories/Arquisoft/Agents_e3b/builds?filter=trigger:build;branch:master;service:5ad7caa5bd119c0001873f4f~Agents_e3b)
[![codecov](https://codecov.io/gh/Arquisoft/Agents_e3b/branch/master/graph/badge.svg)](https://codecov.io/gh/Arquisoft/Agents_e3b)
[![Gitter](https://badges.gitter.im/Arquisoft/Agents_e3b.svg)](https://gitter.im/Arquisoft/Agents_e3b?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)


# Agents e3b

Módulo de gestión de Agentes. Escuela Ingeniería Informática Universidad de Oviedo.

## Ejecucion con Maven
Para la ejecución del módulo Agents, hay que ejecutar:

- `mvn spring-boot:run`
- El servicio arranca en `localhost:8090`

Esto se puede modificar cambiando el valor del puerto en el fichero [src\main\resources\application.properties](https://github.com/Arquisoft/Agents_e3b/blob/master/src/main/resources/application.properties)

## Datos usuarios de prueba

|Name                     | Password | Location               | Email                    | Ident         | Kind   |
|-------------------------|----------|------------------------|--------------------------|---------------|--------|
|Paco González            | 123456   |                        | paco@gmail.com           | paco          | Person |
|Pepe Fernandez           | 123456   |                        | pepe@gmail.com           | pepe          | Person |
|Sensor\_123 2018         | 123456   | 43.361368, -5.853591   | admin@sensores.com       | sensor\_123   | Sensor |
|Ministerio medioambiente | 123456   | 43.359486, -5.846986   | ambiente@ministerio.com  | medioambiente | Entity |
|Space X sensor model A   | 123456   | 33.921209, -118.327940 | musk@spacex.com          | spacex        | Sensor |

# Authors (2017/2018)

- Miguel Martínez Serrano (UO237030)
- José Antonio Marín Álvarez (UO212006)
- Daniel Martínez Valerinao (UO252438)
- Andrés Ángel González Granda (UO68216)
- Kilian Pérez González (UO21504)

# Authors (2016/2017)
(participants1a)
- David Lorenzo González (UO244795)
- Martín Peláez Díaz (UO236974)
- Laura Menéndez Pérez (UO244646)
- Fernando Palazuelo Ginzo (UO244588)
