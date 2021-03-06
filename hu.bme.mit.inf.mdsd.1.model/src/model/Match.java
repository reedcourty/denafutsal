/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Match#getDate <em>Date</em>}</li>
 *   <li>{@link model.Match#getLocation <em>Location</em>}</li>
 *   <li>{@link model.Match#getType <em>Type</em>}</li>
 *   <li>{@link model.Match#getAgeGroup <em>Age Group</em>}</li>
 *   <li>{@link model.Match#getId <em>Id</em>}</li>
 *   <li>{@link model.Match#getReferee <em>Referee</em>}</li>
 *   <li>{@link model.Match#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link model.Match#getThirdReferee <em>Third Referee</em>}</li>
 *   <li>{@link model.Match#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link model.Match#getEvents <em>Events</em>}</li>
 *   <li>{@link model.Match#getHome <em>Home</em>}</li>
 *   <li>{@link model.Match#getVisitor <em>Visitor</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see model.ModelPackage#getMatch_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link model.Match#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see model.ModelPackage#getMatch_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link model.Match#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link model.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see model.Type
	 * @see #setType(Type)
	 * @see model.ModelPackage#getMatch_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link model.Match#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see model.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Age Group</b></em>' attribute.
	 * The literals are from the enumeration {@link model.AgeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Group</em>' attribute.
	 * @see model.AgeGroup
	 * @see #setAgeGroup(AgeGroup)
	 * @see model.ModelPackage#getMatch_AgeGroup()
	 * @model
	 * @generated
	 */
	AgeGroup getAgeGroup();

	/**
	 * Sets the value of the '{@link model.Match#getAgeGroup <em>Age Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Group</em>' attribute.
	 * @see model.AgeGroup
	 * @see #getAgeGroup()
	 * @generated
	 */
	void setAgeGroup(AgeGroup value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see model.ModelPackage#getMatch_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link model.Match#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Referee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referee</em>' containment reference.
	 * @see #setReferee(Person)
	 * @see model.ModelPackage#getMatch_Referee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Person getReferee();

	/**
	 * Sets the value of the '{@link model.Match#getReferee <em>Referee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referee</em>' containment reference.
	 * @see #getReferee()
	 * @generated
	 */
	void setReferee(Person value);

	/**
	 * Returns the value of the '<em><b>Assistant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assistant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assistant</em>' containment reference.
	 * @see #setAssistant(Person)
	 * @see model.ModelPackage#getMatch_Assistant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Person getAssistant();

	/**
	 * Sets the value of the '{@link model.Match#getAssistant <em>Assistant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assistant</em>' containment reference.
	 * @see #getAssistant()
	 * @generated
	 */
	void setAssistant(Person value);

	/**
	 * Returns the value of the '<em><b>Third Referee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Referee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Referee</em>' containment reference.
	 * @see #setThirdReferee(Person)
	 * @see model.ModelPackage#getMatch_ThirdReferee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Person getThirdReferee();

	/**
	 * Sets the value of the '{@link model.Match#getThirdReferee <em>Third Referee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Referee</em>' containment reference.
	 * @see #getThirdReferee()
	 * @generated
	 */
	void setThirdReferee(Person value);

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' containment reference.
	 * @see #setSupervisor(Person)
	 * @see model.ModelPackage#getMatch_Supervisor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Person getSupervisor();

	/**
	 * Sets the value of the '{@link model.Match#getSupervisor <em>Supervisor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' containment reference.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(Person value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link model.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see model.ModelPackage#getMatch_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' containment reference.
	 * @see #setHome(Team)
	 * @see model.ModelPackage#getMatch_Home()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Team getHome();

	/**
	 * Sets the value of the '{@link model.Match#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(Team value);

	/**
	 * Returns the value of the '<em><b>Visitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visitor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitor</em>' containment reference.
	 * @see #setVisitor(Team)
	 * @see model.ModelPackage#getMatch_Visitor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Team getVisitor();

	/**
	 * Sets the value of the '{@link model.Match#getVisitor <em>Visitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visitor</em>' containment reference.
	 * @see #getVisitor()
	 * @generated
	 */
	void setVisitor(Team value);

} // Match
