package net.javacoding.jspider.core.rule.impl;

import net.javacoding.jspider.api.model.Decision;
import net.javacoding.jspider.api.model.Site;
import net.javacoding.jspider.core.SpiderContext;
import net.javacoding.jspider.core.model.DecisionInternal;

import java.net.URL;

/**
 * $Id: BaseURLOnlyRule.java,v 1.2 2003/03/27 17:44:07 vanrogu Exp $
 *
 * @author Gunther Van Roey.
 */
public class BaseURLOnlyRule extends BaseRuleImpl {

    public Decision apply(SpiderContext context, Site currentSite, URL url) {
        boolean equals = context.getBaseURL().equals(url);
        if (equals) {
            return new DecisionInternal(Decision.RULE_ACCEPT, "url accepted");
        } else {
            return new DecisionInternal(Decision.RULE_IGNORE, "url ignored because it is not the base url");
        }
    }

}

