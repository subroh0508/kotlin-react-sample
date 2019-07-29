
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.div
import styled.css
import styled.styledButton

external interface AppState : RState {
    var count: Int
}

class App : RComponent<RProps, AppState>() {
    override fun AppState.init() {
        count = 0
    }

    private fun onClickedButton() {
        setState { count += 1 }
    }

    override fun RBuilder.render() {
        div { +"count: ${state.count}" }

        styledButton {
            css {
                width = 200.px
                height = 100.px

                backgroundColor = Color.aqua
            }

            attrs.onClickFunction = { onClickedButton() }

            +"click!"
        }
    }
}
