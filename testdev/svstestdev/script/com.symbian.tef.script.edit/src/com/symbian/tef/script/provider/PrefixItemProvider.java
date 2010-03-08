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


package com.symbian.tef.script.provider;


import com.symbian.tef.script.Prefix;
import com.symbian.tef.script.ScriptFactory;
import com.symbian.tef.script.ScriptPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.symbian.tef.script.Prefix} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrefixItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ScriptPackage.Literals.CONTAINER__TEF);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Prefix.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Prefix"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Prefix_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Prefix.class)) {
			case ScriptPackage.PREFIX__TEF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createTestCase()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createTestStep()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createLoadSuite()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createLoadServer()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createRunUtils()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createRunProgram()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createRunScript()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createConsecutive()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createConcurrent()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createSharedData()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createTefComment()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createTestBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createCreateObject()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createRestoreObject()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createOutstanding()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createAsyncDelay()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createSharedActiveScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(ScriptPackage.Literals.CONTAINER__TEF,
				 ScriptFactory.eINSTANCE.createStoreActiveScheduler()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TefEditPlugin.INSTANCE;
	}

}
