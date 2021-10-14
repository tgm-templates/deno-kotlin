build:
  ./gradlew -x browserTest clean browserDistribution

release:
  ./gradlew -x browserTest clean browserProductionWebpack

run-bundle:
  deno run -A build/distributions/bundle.js

setup:
  brew install deno
  npm install -g dukat
