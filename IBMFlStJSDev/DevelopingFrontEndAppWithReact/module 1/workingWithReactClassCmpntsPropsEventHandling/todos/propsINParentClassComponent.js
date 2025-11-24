import React, { Component } from "react"
import EmployeeDetails from './EmployeeDertails'

function OrganizationDertails () {
    let employee_designation = 'Project Manager';
    return (
        <>
            <EmployeeDetails employee_designation = { employee_designation }/>
        </>
    )
}
export default OrganizationDertails

class EmployeeDertails extends Component {
    //Constructor() and handleInput() methods here
render() {
    const { emp_id, emp_email } = this.state;
    const { employee_designation } = this.props;
    return (
        <div className="EmployeeDetails">
            <input type="text" name="emp_id" value={emp_id}
            onChange={this.handleInputChange} placeholder='Enter Employee Id'/>
            <input type="email" name="emp_email" value={emp_email}
            onChange={this.handleInputChange} placeholder='Enter Employee Email'/>
            <button onClick={ () => alert(`Employee ID: ${emp_id}, Email: ${ emp_email }, 
            Designation: ${ employee_designation}`)}>Show Details</button>            
        </div>
    );

}
} 
export default EmployeeDetails;