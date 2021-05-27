/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, Lars van Soest
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.larsvansoest.runelite.clueitems.ui.input;

import java.util.Map;
import javax.swing.Icon;

class FilterButtonOption<T>
{
	private final Map.Entry<T, Icon> primary;
	private final Map.Entry<T, Icon> secondary;
	private final String toolTip;

	public FilterButtonOption(Map.Entry<T, Icon> primary, Map.Entry<T, Icon> secondary, String toolTip) {
		this.primary = primary;
		this.secondary = secondary;
		this.toolTip = toolTip;
	}

	public Map.Entry<T, Icon> getPrimary()
	{
		return this.primary;
	}

	public Map.Entry<T, Icon> getSecondary()
	{
		return this.secondary;
	}

	public String getToolTip() { return this.toolTip; }
}