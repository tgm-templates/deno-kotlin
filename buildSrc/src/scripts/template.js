import Kotlin from "https://jspm.dev/kotlin@1.5.30"
import KotlinxCoroutinesCore from "https://jspm.dev/kotlinx-coroutines-core@1.5.2"

//===== global imports ===========
//deps.js

//===== stub for commonjs ===========
const module = {
  exports: {}
};

function require(moduleName) {
  if (moduleName === 'kotlin') {
    return Kotlin;
  } else if (moduleName === 'kotlinx-coroutines-core') {
    return KotlinxCoroutinesCore;
  } else {
    return {};
  }
}

//===== compiled Javascript code from Kotlin ====
//compiledCode

//====== export default for library =======
export default module.exports;

