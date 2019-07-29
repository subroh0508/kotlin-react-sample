
import kotlinx.html.js.onClickFunction
import materialui.components.button.button
import materialui.components.button.enums.ButtonColor
import materialui.components.button.enums.ButtonVariant
import materialui.components.typography.enums.TypographyVariant
import materialui.components.typography.typography
import react.*

interface AppState : RState {
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
        typography {
            attrs.variant = TypographyVariant.h6

            +"count: ${state.count}"
        }

        button {
            attrs {
                variant = ButtonVariant.contained
                color = ButtonColor.secondary

                onClickFunction = { onClickedButton() }
            }

            +"clicked!"
        }
    }
}