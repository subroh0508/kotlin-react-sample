
import react.dom.render
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        child(App::class) { }
    }

    /*
     * document.getElementById("root")?.let {
     *     render(buildElement {
     *         child(App::class) {}
     *     }, it)
     * }
     */
}
