package react.semanticui.modules.accordion

import japgolly.scalajs.react.test._
import react.semanticui.elements.icon._
import utest._

object AccordionTitleTests extends TestSuite {
  val tests = Tests {
    test("content") {
      val title = AccordionTitle(content = "Señor")
      ReactTestUtils.withNewBodyElement { mountNode =>
        title.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="title"><i aria-hidden="true" class="dropdown icon"></i>Señor</div>"""
        )
      }
    }
    test("content") {
      val title = AccordionTitle("Señora")
      ReactTestUtils.withNewBodyElement { mountNode =>
        title.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="title"><i aria-hidden="true" class="dropdown icon"></i>Señora</div>"""
        )
      }
    }
    test("active") {
      val title = AccordionTitle(content = "Médico", active = true)
      ReactTestUtils.withNewBodyElement { mountNode =>
        title.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="active title"><i aria-hidden="true" class="dropdown icon"></i>Médico</div>"""
        )
      }
    }
    test("icon") {
      val title = AccordionTitle(content = "Profesora", icon = Icon("home"))
      ReactTestUtils.withNewBodyElement { mountNode =>
        title.renderIntoDOM(mountNode)
        assert(
          mountNode.innerHTML == """<div class="title"><i aria-hidden="true" class="home icon"></i>Profesora</div>"""
        )
      }
    }
  }
}
