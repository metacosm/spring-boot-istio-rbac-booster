/**
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 * <p>
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.openshift.booster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author <a href="claprun@redhat.com">Christophe Laprun</a>
 */
@Controller
public class FrontendController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
