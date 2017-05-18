# kotlin-apps

- shared
- cli
- backend
- frontend

## shared

공통으로 사용하는 코틀린 코드

```groovy
dependencies {
    compile "org.jetbrains.kotlin:kotlin-stdlib-common:$kotlin_version"
}
```

## cli

`shared`를 사용하는 커맨드라인 앱

### 실행

```sh
$ ./gradlew -q cli:run
```

보다 구체적인 예제는 [hello-kotlin] 참고


## backend

`shared`를 사용하는 서버

### 실행

```sh
$ ./gradlew backend:run  # http://localhost:8080 확인
```

## frontend

TODO

### 빌드

```sh
$ ./gradlew frontend:build  # ./frontend/web 폴더 확인
```


# References

- [hello-kotlin]
- [kotlin-frontend-plugin]
- [kotlin-fullstack-sample]
- [ktor]


# License

MIT © [Jaewe Heo]


[hello-kotlin]: https://github.com/importre/hello-kotlin
[kotlin-frontend-plugin]: https://github.com/Kotlin/kotlin-frontend-plugin
[kotlin-fullstack-sample]: https://github.com/Kotlin/kotlin-fullstack-sample
[ktor]: https://github.com/Kotlin/ktor
[Jaewe Heo]: jaeweheo@gmail.com
