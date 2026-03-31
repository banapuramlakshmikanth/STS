import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import Home from './Home.jsx'

function App() {
  const [count, setCount] = useState(0)

  return (
    //Have a navihation bar here fir skill dasjboard  and so on
    <>
    <h1>This is App</h1>
    <Home/>
    </>
  )
}

export default App
