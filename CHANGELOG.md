# Changelog

## [1.5.5](https://github.com/sweatboys/open-discogs-api/compare/v1.5.4...v1.5.5) (2022-12-28)


### Bug Fixes

* adds fix for swagger malformed url ([94d6fe4](https://github.com/sweatboys/open-discogs-api/commit/94d6fe4c2b70d961050ffb11b417c805f797cc3a))
* revert back prometheus exemplar config ([7673823](https://github.com/sweatboys/open-discogs-api/commit/7673823bb9c0e159dc8e531fda5e591fc1097189))

## [1.5.4](https://github.com/sweatboys/open-discogs-api/compare/v1.5.3...v1.5.4) (2022-12-28)


### Bug Fixes

* adds native cors handler from netty not framework ([5f62b5d](https://github.com/sweatboys/open-discogs-api/commit/5f62b5d8e398bc2217223d62aa197d582b9cd9bf))

## [1.5.3](https://github.com/sweatboys/open-discogs-api/compare/v1.5.2...v1.5.3) (2022-12-23)


### Bug Fixes

* moves helm chart to group chart repo ([0a77ea3](https://github.com/sweatboys/open-discogs-api/commit/0a77ea39896710337e09291ef8ea4b832d6fd656))

## [1.5.2](https://github.com/sweatboys/open-discogs-api/compare/v1.5.1...v1.5.2) (2022-12-23)


### Bug Fixes

* adds fix for deployment parser again ([8dedd88](https://github.com/sweatboys/open-discogs-api/commit/8dedd88ae9454a93bf9dda0f533761ec8955e4e8))

## [1.5.1](https://github.com/sweatboys/open-discogs-api/compare/v1.5.0...v1.5.1) (2022-12-23)


### Bug Fixes

* **helm:** fixes deployment.yml parser for env map ranging ([7f09eb8](https://github.com/sweatboys/open-discogs-api/commit/7f09eb821d606a5cad36ec911b6947596735a39b))

## [1.5.0](https://github.com/sweatboys/open-discogs-api/compare/v1.4.0...v1.5.0) (2022-12-23)


### Features

* adds documentations with helm env support ([a591802](https://github.com/sweatboys/open-discogs-api/commit/a5918025402916a1cdab0a0455f0ca792d3c7e98))


### Bug Fixes

* adds missing configurable swagger-ui-url ([27467d8](https://github.com/sweatboys/open-discogs-api/commit/27467d8ca5307682d43f01a52a13ac7d3f3a64ea))

## [1.4.0](https://github.com/sweatboys/open-discogs-api/compare/v1.3.2...v1.4.0) (2022-12-23)


### Features

* bump gradle wrapper for 7.6 ([4c804c7](https://github.com/sweatboys/open-discogs-api/commit/4c804c71fdcc2fe2725c82fd3e50ccf4615fe503))

## [1.3.2](https://github.com/sweatboys/open-discogs-api/compare/v1.3.1...v1.3.2) (2022-12-23)


### Bug Fixes

* adds default meta info for WebFluxHandler ([b6d8906](https://github.com/sweatboys/open-discogs-api/commit/b6d8906fd9274973d8d2b7db99a8bf15e8655092))
* removes redandant dependencies ([96e6bc8](https://github.com/sweatboys/open-discogs-api/commit/96e6bc8763dc8de3c61d4246330db4c8e8570483))

## [1.3.1](https://github.com/sweatboys/open-discogs-api/compare/v1.3.0...v1.3.1) (2022-12-21)


### Bug Fixes

* adds missing exporter ([0adb502](https://github.com/sweatboys/open-discogs-api/commit/0adb502ae6fde792e4b6fa3fe776779515555100))

## [1.3.0](https://github.com/sweatboys/open-discogs-api/compare/v1.2.2...v1.3.0) (2022-12-21)


### Features

* adds extra fields for helm values ([ee4a5ef](https://github.com/sweatboys/open-discogs-api/commit/ee4a5eff98c6b5b279f3173bafd62372f00dc93e))

## [1.2.2](https://github.com/sweatboys/open-discogs-api/compare/v1.2.1...v1.2.2) (2022-12-21)


### Bug Fixes

* corrects version update to be applied ([4da3ee5](https://github.com/sweatboys/open-discogs-api/commit/4da3ee5e6460e76e4b8b12cbe32d9f8bed18208c))

## [1.2.1](https://github.com/sweatboys/open-discogs-api/compare/v1.2.0...v1.2.1) (2022-12-21)


### Bug Fixes

* **helm:** adds quotation for ports ([266432a](https://github.com/sweatboys/open-discogs-api/commit/266432a69f65aaf8f4691cfa79b5af1b67ebfec8))

## [1.2.0](https://github.com/sweatboys/open-discogs-api/compare/v1.1.0...v1.2.0) (2022-12-21)


### Features

* routes actuator to API_SERVER_HOST target ([f8e61f4](https://github.com/sweatboys/open-discogs-api/commit/f8e61f4eb715d601412bfaed0b14874853bd1c00))

## [1.1.0](https://github.com/sweatboys/open-discogs-api/compare/v1.0.0...v1.1.0) (2022-12-21)


### Features

* adds support for open telemetry ([1997a08](https://github.com/sweatboys/open-discogs-api/commit/1997a085f546dba9551fb2a74cb5f077940fc7fd))


### Bug Fixes

* adds sortable params to artist controller ([0f26a30](https://github.com/sweatboys/open-discogs-api/commit/0f26a30445f6b643ee4ad6d9463b6ae9b8aa046e))
* updates container release strategy ([dad1e8f](https://github.com/sweatboys/open-discogs-api/commit/dad1e8f5effc5fa525f052e3eabce9b60ee29a19))

## 1.0.0 (2022-12-19)


### Features

* adds domain for label and master. ([e3670be](https://github.com/sweatboys/open-discogs-api/commit/e3670be18104db5883e666b2ffe6003692aaa779))
* adds example for query with r2dbc repository ([5082dc5](https://github.com/sweatboys/open-discogs-api/commit/5082dc514d385aad75bdd896d7d0b435cb7c577b))
* adds index on label full text searches ([581d38a](https://github.com/sweatboys/open-discogs-api/commit/581d38ae6452293cc9f142298e7d7a8b1214d3dd))
* adds index on label full text searches ([d7be0ff](https://github.com/sweatboys/open-discogs-api/commit/d7be0ff296db074c29a779e6333f3ac915fafecb))
* adds trigram text search on artist ([87d83d5](https://github.com/sweatboys/open-discogs-api/commit/87d83d5c9d9953803b4952617dcee6e61bbb0313))
* implements initial releases endpoint ([498d1c1](https://github.com/sweatboys/open-discogs-api/commit/498d1c18d78418a0be6de9de6d40c002d0648ce3))
* implements search on master ([78ceebd](https://github.com/sweatboys/open-discogs-api/commit/78ceebdd78e27f1aa9662e516f9947d5f12ee5b5))
* implements search on master ([f287bc9](https://github.com/sweatboys/open-discogs-api/commit/f287bc9de4ccfefde64995232c9a5f72fbba2011))
* implements search on master ([ed57ee7](https://github.com/sweatboys/open-discogs-api/commit/ed57ee77c851a5e8b1c09c9c9e8dce906293bc2c))
* initial implementation of artist service layer ([41151e3](https://github.com/sweatboys/open-discogs-api/commit/41151e3328a64ca3340b2fffb07bee00b538241f))
* initial implementation of label service layer ([1802801](https://github.com/sweatboys/open-discogs-api/commit/18028018aa6c54df6d30b5c13c3c34347959a548))
* initial implementation of label service layer ([8516cd1](https://github.com/sweatboys/open-discogs-api/commit/8516cd1a69999b634c809207cbb5e3bafe4ebb76))
* initial implementation of label service layer ([d8492f9](https://github.com/sweatboys/open-discogs-api/commit/d8492f9df6ca1533e15108a023278e75550d051a))
* initial implementation of label service layer ([b4731ee](https://github.com/sweatboys/open-discogs-api/commit/b4731ee4bd2bfafd77f9712adc6bf331c681137f))
* migrated and fixed artist releases api logic to jooq ([320ce21](https://github.com/sweatboys/open-discogs-api/commit/320ce2150ae185fb6b015e3c6a894b0a5468cecc))


### Bug Fixes

* adds indentation fix and error handling on API ([b95390a](https://github.com/sweatboys/open-discogs-api/commit/b95390a093a61efc62f3fd9a346c2a52d6e665ba))
* pluralized resource endpoint. ([9f361d3](https://github.com/sweatboys/open-discogs-api/commit/9f361d33422f6ddff676b98e49640c091cd7b37e))
* rebuild error handling with base exception ([dcc7fa1](https://github.com/sweatboys/open-discogs-api/commit/dcc7fa1af29fcba7b12bd2686dc41f06ee584e17))
* removes spring native layer on build ([b6c508e](https://github.com/sweatboys/open-discogs-api/commit/b6c508e6136895bbf3f7e253f240276e34b87d8f))
* unifies query param name for artist. ([4f5d378](https://github.com/sweatboys/open-discogs-api/commit/4f5d378fe695b6fc04719a31e434b72bc7f5b36c))
