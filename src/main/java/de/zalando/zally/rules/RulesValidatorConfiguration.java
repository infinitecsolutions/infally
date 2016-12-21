package de.zalando.zally.rules;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class RulesValidatorConfiguration {

    @Bean
    public RulesValidator createRulesValidator() {
        return new RulesValidator(Arrays.asList(
                new AvoidTrailingSlashesRule(),
                new KebabCaseInPathSegmentsRule(),
                new SecureWithOAuth2Rule(),
                new SuccessResponseAsJsonObjectRule(),
                new NoVersionInUriRule(),
                new SnakeCaseForQueryParamsRule(),
                new AvoidLinkHeadersRule(),
                new SnakeCaseInPropNameRule(),
                new LimitNumberOfResourcesRule(),
                new UseProblemJsonRule(),
                new AvoidJavascriptKeywordsRule(),
                new CommonFieldNamesRule(),
                new DefineOAuthScopesRule(),
                new HyphenateHttpHeadersRule(),
                new MediaTypesRule(),
                new LimitNumberOfSubresourcesRule(),
                new EverySecondPathLevelParameterRule()
        ));
    }
}
