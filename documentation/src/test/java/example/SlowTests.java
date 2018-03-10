/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package example;

// tag::user_guide[]
import java.util.stream.IntStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.SameThreadExecution;

@Disabled
class SlowTests {

	@SameThreadExecution
	@Test
	void a() {
		foo();
	}

	@Test
	void b() {
		foo();
	}

	@Test
	void c() {
		foo();
	}

	@Test
	void d() {
		foo();
	}

	@Test
	void e() {
		foo();
	}

	@Test
	void f() {
		foo();
	}

	@Test
	void g() {
		foo();
	}

	@Test
	void h() {
		foo();
	}

	@Test
	void i() {
		foo();
	}

	@Test
	void j() {
		foo();
	}

	@Test
	void k() {
		foo();
	}

	@Test
	void l() {
		foo();
	}

	@Test
	void m() {
		foo();
	}

	@Test
	void n() {
		foo();
	}

	@Test
	void o() {
		foo();
	}

	@Test
	void p() {
		foo();
	}

	@SameThreadExecution
	@Test
	void q() {
		foo();
	}

	@Test
	void r() {
		foo();
	}

	@Test
	void s() {
		foo();
	}

	private void foo() {
		IntStream.range(1, 100_000_000).mapToDouble(i -> Math.pow(i, i)).map(Math::sqrt).max();
	}
}
// end::user_guide[]