/*
* Copyright (c) 2005-2009 Nokia Corporation and/or its subsidiary(-ies).
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


package com.symbian.tef.script;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.symbian.tef.script.Container#getTef <em>Tef</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.symbian.tef.script.ScriptPackage#getContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Container extends Tef {
	/**
	 * Returns the value of the '<em><b>Tef</b></em>' containment reference list.
	 * The list contents are of type {@link com.symbian.tef.script.Tef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tef</em>' containment reference list.
	 * @see com.symbian.tef.script.ScriptPackage#getContainer_Tef()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tef> getTef();

} // Container