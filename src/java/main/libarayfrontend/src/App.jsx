import {useEffect, useState} from 'react'
import reactLogo from './assets/react.svg'
import './App.css'

function App() {
    const [title, setTitle] = useState();
    const [author, setAuthor] = useState();

    const changeValue=()=> {

    }
    const changeValue2=()=> {

    }

  return (
    <div className="App">
        <h2>fill the book form</h2>
       <form className="div" onSubmit={}>
           <label>titiel</label>
           <input />
           <label>author</label>
           <input/>
           <button className="btn">submit</button>
       </form>
    </div>
  )
}

export default App
