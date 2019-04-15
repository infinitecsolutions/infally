package de.zalando.zally.rule.infinitec

import de.zalando.zally.rule.AbstractRuleSet
import de.zalando.zally.rule.api.Rule
import org.springframework.stereotype.Component
import java.net.URI

@Component
class InfinitecRuleSet : AbstractRuleSet() {
    override val id: String = javaClass.simpleName
    override val title: String = "Infinitec RESTful API Guidelines"
    override val url: URI = URI.create("https://internal-docs.nova.infinitec.solutions/api-guidelines")
    override fun url(rule: Rule): URI {
        return url.resolve("#${rule.id}")
    }
}
