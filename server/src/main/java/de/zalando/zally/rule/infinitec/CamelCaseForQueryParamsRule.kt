package de.zalando.zally.rule.infinitec

import com.typesafe.config.Config
import de.zalando.zally.rule.CaseChecker
import de.zalando.zally.rule.api.Check
import de.zalando.zally.rule.api.Context
import de.zalando.zally.rule.api.Rule
import de.zalando.zally.rule.api.Severity
import de.zalando.zally.rule.api.Violation

/**
 * Lint for camel case for query params
 */
@Rule(
    ruleSet = InfinitecRuleSet::class,
    id = "130",
    severity = Severity.MUST,
    title = "Use CamelCase (never snake_case) for Query Parameters"
)
class CamelCaseForQueryParamsRule(config: Config) {

    val description = "Query parameter has to be CamelCase"

    private val checker = CaseChecker.load(config)

    @Check(severity = Severity.MUST)
    fun checkQueryParameter(context: Context): List<Violation> =
        checker.checkQueryParameterNames(context).map { Violation(description, it.pointer) }
}
