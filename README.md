# cursive-test-issue

Sample project to demonstrate an issue in Cursive relating to tests.

## Usage

1. Open this project in Cursive/Intellij.
2. Run a repl
3. Navigate to `test\cursive-test-issue\core-test`
4. Perform "Run Tests in Current NS in REPL"

**Note that:**

Both tests fail, but the second one does not report in the gutter of the `core-test.clj` file, so no visual clue is given in the code editor as to what the failure is or where it has occurred.

This is a real problem with very large test files with multiple tests that use the `f-is` function.

This is a simplification of the problem we are experiencing on our project. In reality our equivalent of the `f-is` function is more complex. It is effectively a shared set of assertions that we want to use from multiple test files.

## License

Copyright © 2022 Hayzee

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
