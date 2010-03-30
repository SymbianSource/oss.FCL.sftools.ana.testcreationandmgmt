/*
* Copyright (c) 2009 Nokia Corporation and/or its subsidiary(-ies).
* All rights reserved.
* This component and the accompanying materials are made available
* under the terms of "Eclipse Public License v1.0"
* which accompanies this distribution, and is available
* at the URL "http://www.eclipse.org/legal/epl-v10.html".
*
* Initial Contributors:
* Nokia Corporation - initial contribution.
*
* Contributors:
*
* Description: 
*
*/
package com.nokia.testfw.codegen.ui.templates;

import org.eclipse.jface.text.templates.GlobalTemplateVariables;
import org.eclipse.jface.text.templates.TemplateContextType;

public class CodeGenTemplateContextType extends TemplateContextType {

	/** This context's id */
	public static final String FILE_TEMPLATE_CONTEXT_TYPE = "com.nokia.testfw.codegen.templates.testfw_template_contexttype"; //$NON-NLS-1$

	public CodeGenTemplateContextType() {
		addGlobalResolvers();
	}

	private void addGlobalResolvers() {
		addResolver(new GlobalTemplateVariables.Cursor());
		// addResolver(new GlobalTemplateVariables.WordSelection());
		// addResolver(new GlobalTemplateVariables.LineSelection());
		// addResolver(new GlobalTemplateVariables.Dollar());
		// addResolver(new GlobalTemplateVariables.Date());
		// addResolver(new GlobalTemplateVariables.Year());
		// addResolver(new GlobalTemplateVariables.Time());
		// addResolver(new GlobalTemplateVariables.User());
	}

}
