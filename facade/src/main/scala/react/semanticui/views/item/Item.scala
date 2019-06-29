package react.semanticui.views.item

import scala.scalajs.js
import js.annotation._
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.JsFnComponent.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.raw.React
import react.common.syntax._
import react.common.style._
import react.semanticui._
import react.semanticui.{ raw => suiraw }

object Item {

  @js.native
  @JSImport("semantic-ui-react", "Item")
  object RawComponent extends js.Function1[js.Any, js.Any] {
    def apply(i: js.Any): js.Any = js.native
  }

  @js.native
  trait ItemProps extends js.Object {

    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.native

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.native

    /** Additional classes. */
    var className: js.UndefOr[String] = js.native

    /** Shorthand for ItemContent component. */
    var content: js.UndefOr[suiraw.SemanticShorthandContent] = js.native

    /** Shorthand for ItemDescription component. */
    var description
      : js.UndefOr[suiraw.SemanticShorthandItem[ItemDescription.ItemDescriptionProps]] = js.native

    /** Shorthand for ItemExtra component. */
    var extra: js.UndefOr[suiraw.SemanticShorthandItem[ItemExtra.ItemExtraProps]] = js.native

    /** Shorthand for ItemHeader component. */
    var header: js.UndefOr[suiraw.SemanticShorthandItem[ItemHeader.ItemHeaderProps]] = js.native

    /** Shorthand for ItemImage component. */
    // image?: SemanticShorthandItem<ItemImageProps>

    /** Shorthand for ItemMeta component. */
    var meta: js.UndefOr[suiraw.SemanticShorthandItem[ItemMeta.ItemMetaProps]] = js.native

  }

  def props(
    as:          js.UndefOr[AsC]                                             = js.undefined,
    children:    js.UndefOr[VdomNode]                                        = js.undefined,
    className:   js.UndefOr[String]                                          = js.undefined,
    clazz:       js.UndefOr[Css]                                             = js.undefined,
    content:     js.UndefOr[VdomNode]                                        = js.undefined,
    description: js.UndefOr[VdomNode | ItemDescription.ItemDescriptionProps] = js.undefined,
    extra:       js.UndefOr[VdomNode | ItemExtra.ItemExtraProps]             = js.undefined,
    header:      js.UndefOr[VdomNode | ItemHeader.ItemHeaderProps]           = js.undefined,
    meta:        js.UndefOr[VdomNode | ItemMeta.ItemMetaProps]               = js.undefined
  ): ItemProps = {
    val p = (new js.Object).asInstanceOf[ItemProps]
    p.as          = as.toJs
    p.children    = children.toJs
    p.className   = (className, clazz).toJs
    p.content     = content.toJs
    p.description = description.toRaw
    p.extra       = extra.toRaw
    p.header      = header.toRaw
    p.meta        = meta.toRaw
    p
  }

  private val component =
    JsFnComponent[ItemProps, Children.Varargs](RawComponent)

  def apply(p: ItemProps, children: VdomNode*): UnmountedWithRoot[
    ItemProps,
    Unit,
    ItemProps
  ] =
    component(p)(children: _*)

}