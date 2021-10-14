Deno Kotlin example
===================
🦕 Deno development with Kotlin.

# how to build project?

* Build the project

```
$ ./gradlew -x browserTest clean browserDistribution
$ deno run -A build/distributions/bundle.js
```

# References

* Deno: https://deno.land/
* Kotlin: https://kotlinlang.org/
* lib.deno.d.ts: https://github.com/denoland/deno/releases/latest/download/lib.deno.d.ts
* dukat: Converter of TypeScript definition files to Kotlin declarations https://github.com/Kotlin/dukat
* jspm: provides a module CDN allowing any package from npm to be directly loaded in the browser and other JS environments https://jspm.org/
