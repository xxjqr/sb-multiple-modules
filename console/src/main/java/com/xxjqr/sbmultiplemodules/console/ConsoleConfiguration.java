package com.xxjqr.sbmultiplemodules.console;

import com.xxjqr.multiple_modules.core.CoreConfiguration;
import com.xxjqr.multiple_modules.core.prod.ProdConfiguration;
import com.xxjqr.multiple_modules.core.ref.RefConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ CoreConfiguration.class })
public class ConsoleConfiguration {
}
