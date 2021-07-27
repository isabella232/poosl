package org.eclipse.poosl.xpect;

import org.eclipse.poosl.xpect.validation.channel.PooslValidationChannelTest;
import org.eclipse.poosl.xpect.validation.importing.PooslValidationImportingTest;
import org.eclipse.poosl.xpect.validation.misc.PooslValidationMiscTest;
import org.eclipse.poosl.xpect.validation.suppress.PooslValidationSuppressTest;
import org.eclipse.poosl.xpect.validation.typecheck.PooslValidationTypeCheckTest;
import org.eclipse.poosl.xpect.validation.unique.PooslValidationUniqueTest;
import org.eclipse.poosl.xpect.validation.unused.PooslValidationUnusedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Declaration of all Xpect tests.
 * <p>
 * This suite can be used in Eclipse to launch all verifications.
 * </p>
 * <p>
 * This test suite is ignored by Maven as it ends with 'Tests' instead of 'Test' or 'TestSuite'.
 * </p>
 * 
 * @author nperansin
 */
@SuiteClasses({
        // Disabled scoping and linking test, no longer uses default xtext reference
        // PooslLinkingTest.class,
        // PooslScopingTest.class,
        PooslValidationMiscTest.class,
        PooslValidationUnusedTest.class, 
        PooslValidationUniqueTest.class, 
        PooslValidationTypeCheckTest.class, 
        PooslValidationChannelTest.class, 
        PooslValidationImportingTest.class,
        PooslValidationSuppressTest.class })

@RunWith(Suite.class)
public class AllPooslXpectTests {
}
