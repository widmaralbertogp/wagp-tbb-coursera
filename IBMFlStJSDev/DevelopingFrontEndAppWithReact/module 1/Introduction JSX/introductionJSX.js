const myHeader = <h1>This is a sample JSX code snippet</h1>

// JSX vs Javascript

// JSX
function App ()
{
    return (
        <div>
            <P>This is a sample List</P>
            <ul>
                <li> List item no. 1 </li>
                <li> List item no. 2 </li>
            </ul>
        </div>
    );
}
// Javascript
function App () {
    return Reactcreateelement(
        "div",
        null,
        React.createElement ("p",null, "this is a sample list",
        React.createElement ("ul",null,
            React.createElement ("li",null, "List item no. 1"),
            React.createElement ("li",null, "List item no. 2")
        )
    );
}