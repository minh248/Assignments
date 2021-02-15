import {useEffect} from 'react'

const EffectLifecycle = (props) => {
    useEffect(() => {
        console.log("render!")
        return () => console.log("unmouting...")
    })

    return (
        <div>{props.number}</div>
    )
}

export default EffectLifecycle