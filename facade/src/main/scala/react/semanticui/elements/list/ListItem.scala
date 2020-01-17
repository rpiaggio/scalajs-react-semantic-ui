package react.semanticui.elements.list

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.elements.image._
import react.semanticui.{ raw => suiraw }

final case class ListItem(
  as:                    js.UndefOr[AsC]                        = js.undefined,
  active:                js.UndefOr[Boolean]                    = js.undefined,
  child:                 js.UndefOr[VdomNode]                   = js.undefined,
  className:             js.UndefOr[String]                     = js.undefined,
  clazz:                 js.UndefOr[Css]                        = js.undefined,
  content:               js.UndefOr[VdomNode]                   = js.undefined,
  description:           js.UndefOr[VdomNode | ListDescription] = js.undefined,
  disabled:              js.UndefOr[Boolean]                    = js.undefined,
  header:                js.UndefOr[VdomNode | ListHeader]      = js.undefined,
  icon:                  js.UndefOr[VdomNode | ListIcon]        = js.undefined,
  image:                 js.UndefOr[VdomNode | Image]           = js.undefined,
  onClickE:              js.UndefOr[ListItem.OnClick]           = js.undefined,
  onClick:               js.UndefOr[Callback]                   = js.undefined,
  value:                 js.UndefOr[String]                     = js.undefined,
  override val children: CtorType.ChildrenArgs                  = Seq.empty
) extends GenericComponentPC[ListItem.ListItemProps] {
  override def cprops = ListItem.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    ListItem.component(ListItem.props(this))
}

object ListItem {
  type OnClick = (ReactMouseEvent, ListItemProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "ListItem")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ListItemProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A list item can active. */
    var active: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for ListItem component. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Shorthand for ListDescription. */
    var description
      : js.UndefOr[suiraw.SemanticShorthandItem[ListDescription.ListDescriptionProps]] = js.native

    /** A list item can disabled. */
    var disabled: js.UndefOr[Boolean] = js.native

    /** Shorthand for ListHeader. */
    var header: js.UndefOr[suiraw.SemanticShorthandItem[ListHeader.ListHeaderProps]] = js.native

    /** Shorthand for ListIcon. */
    var icon: js.UndefOr[suiraw.SemanticShorthandItem[ListIcon.ListIconProps]] = js.native

    /** Shorthand for Image. */
    var image: js.UndefOr[suiraw.SemanticShorthandItem[Image.ImageProps]] = js.native

    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[js.Function2[ReactMouseEvent, ListItemProps, Unit]] = js.native

    /** A value for an ordered list. */
    var value: js.UndefOr[String] = js.native
  }

  def props(q: ListItem): ListItemProps =
    rawprops(q.as,
             q.active,
             q.child,
             q.className,
             q.clazz,
             q.content,
             q.description,
             q.disabled,
             q.header,
             q.icon,
             q.image,
             q.onClickE,
             q.onClick,
             q.value)

  def rawprops(
    as:          js.UndefOr[AsC]                        = js.undefined,
    active:      js.UndefOr[Boolean]                    = js.undefined,
    children:    js.UndefOr[VdomNode]                   = js.undefined,
    className:   js.UndefOr[String]                     = js.undefined,
    clazz:       js.UndefOr[Css]                        = js.undefined,
    content:     js.UndefOr[VdomNode]                   = js.undefined,
    description: js.UndefOr[VdomNode | ListDescription] = js.undefined,
    disabled:    js.UndefOr[Boolean]                    = js.undefined,
    header:      js.UndefOr[VdomNode | ListHeader]      = js.undefined,
    icon:        js.UndefOr[VdomNode | ListIcon]        = js.undefined,
    image:       js.UndefOr[VdomNode | Image]           = js.undefined,
    onClickE:    js.UndefOr[ListItem.OnClick]           = js.undefined,
    onClick:     js.UndefOr[Callback]                   = js.undefined,
    value:       js.UndefOr[String]                     = js.undefined
  ): ListItemProps = {
    val p = (new js.Object).asInstanceOf[ListItemProps]
    p.as          = as.toJs
    p.active      = active
    p.children    = children.toJs
    p.className   = (className, clazz).toJs
    p.content     = content.toJs
    p.description = fnToRawOrProps(description)
    p.disabled    = disabled
    p.header      = fnToRawOrProps(header)
    p.icon        = toRawOrPropsP(icon)
    p.image       = fnToRawOrProps(image)
    p.onClick     = (onClickE, onClick).toJs
    p.value       = value
    p
  }

  private val component =
    JsComponent[ListItemProps, Children.Varargs, Null](RawComponent)

  def apply(content: VdomNode*): ListItem =
    ListItem(children = content)
}