package react.semanticui.elements.rail

import scala.scalajs.js
import scala.scalajs.js.|
import js.annotation._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import react.common.style._
import react.common._
import react.semanticui.{ raw => suiraw }
import react.semanticui._
import react.semanticui.sizes._
import react.semanticui.floats._

final case class Rail(
  as:                    js.UndefOr[AsC] = js.undefined,
  attached:              js.UndefOr[Boolean] = js.undefined,
  child:                 js.UndefOr[VdomNode] = js.undefined,
  className:             js.UndefOr[String] = js.undefined,
  clazz:                 js.UndefOr[Css] = js.undefined,
  close:                 js.UndefOr[RailClose] = js.undefined,
  content:               js.UndefOr[VdomNode] = js.undefined,
  dividing:              js.UndefOr[Boolean] = js.undefined,
  internal:              js.UndefOr[Boolean] = js.undefined,
  position:              js.UndefOr[SemanticFloats],
  size:                  js.UndefOr[SemanticSize] = js.undefined,
  override val children: CtorType.ChildrenArgs = Seq.empty
) extends GenericFnComponentPC[Rail.RailProps] {
  override def cprops = Rail.props(this)
  override def withChildren(children: CtorType.ChildrenArgs) =
    copy(children = children)
  @inline def renderWith =
    Rail.component(Rail.props(this))
}

object Rail {
  @js.native
  @JSImport("semantic-ui-react", "Rail")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait RailProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** A rail can appear attached to the main viewport. */
    var attached: js.UndefOr[Boolean] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** A rail can appear closer to the main viewport. */
    var close: js.UndefOr[Boolean | String] = js.native

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** A rail can create a division between itself and a container. */
    var dividing: js.UndefOr[Boolean] = js.native

    /** A rail can attach itself to the inside of a container. */
    var internal: js.UndefOr[Boolean] = js.native

    /** A rail can be presented on the left or right side of a container. */
    var position: js.UndefOr[suiraw.SemanticFLOATS] = js.native

    /** A rail can have different sizes. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native
  }

  def props(
    q: Rail
  ): RailProps =
    rawprops(
      q.as,
      q.attached,
      q.child,
      q.className,
      q.clazz,
      q.close,
      q.content,
      q.dividing,
      q.internal,
      q.position,
      q.size
    )

  def rawprops(
    as:        js.UndefOr[AsC]            = js.undefined,
    attached:  js.UndefOr[Boolean]        = js.undefined,
    child:     js.UndefOr[VdomNode]       = js.undefined,
    className: js.UndefOr[String]         = js.undefined,
    clazz:     js.UndefOr[Css]            = js.undefined,
    close:     js.UndefOr[RailClose]      = js.undefined,
    content:   js.UndefOr[VdomNode]       = js.undefined,
    dividing:  js.UndefOr[Boolean]        = js.undefined,
    internal:  js.UndefOr[Boolean]        = js.undefined,
    position:  js.UndefOr[SemanticFloats] = js.undefined,
    size:      js.UndefOr[SemanticSize]   = js.undefined
  ): RailProps = {
    val p = as.toJsObject[RailProps]
    p.attached  = attached
    p.children  = child.toJs
    p.className = (className, clazz).toJs
    p.close     = close.toJs
    p.content   = content.toJs
    p.dividing  = dividing
    p.internal  = internal
    p.position  = position.toJs
    p.size      = size.toJs
    p
  }

  private val component =
    JsFnComponent[RailProps, Children.Varargs](RawComponent)

  def apply(position: SemanticFloats, content: VdomNode*): Rail =
    new Rail(position = position, children = content)

}
