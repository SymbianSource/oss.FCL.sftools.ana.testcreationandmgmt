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


package com.nokia.s60tools.stif.configmanager;

/**
 * File creation mode type
 * 
 */
public enum FileCreationMode { 
	/**
	 * Value not defined 
	 */
	NOT_DEFINED, 
	/**
	 * Unknown value
	 */
	UNKNOWN, 
	/**
	 * Overwrite old file
	 */
	OVERWRITE, 
	/**
	 * Append to old file
	 */
	APPEND }