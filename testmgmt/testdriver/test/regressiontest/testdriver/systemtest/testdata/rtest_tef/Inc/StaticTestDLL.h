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


 

#include <e32cons.h>

class CMessengerTest : public CBase
  	{
public:
		// Construction
	IMPORT_C static CMessengerTest* NewLC(CConsoleBase& aConsole, const TDesC& aString);
	
		// Destructor - virtual and class not intended
		// for derivation, so not exported
	~CMessengerTest();
	
		// general functions - exported
	IMPORT_C void ShowMessage();
	
private:
		// C++ constructor - not exported;
		// implicitly called from NewLC()
	CMessengerTest(CConsoleBase& aConsole);
	
		// 2nd phase construction, called by NewLC()
	void ConstructL(const TDesC& aString); // second-phase constructor
	
private:
	CConsoleBase& iConsole; // Use the console (but not owned)
	HBufC*        iString;  // Allocated container for string data (destructor destroys)
	};
