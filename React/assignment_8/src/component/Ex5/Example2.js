import React, {useEffect, useMemo, useState, useContext} from 'react'

const Example2 = () => {
    const [count, setCount] = useState(0)
    const [wordIndex, setWordIndex] = useState(0)

    const words = ["hey", "this", "is", "cool"]
    const word = words[wordIndex]

    const computeLetterCount = word => {
        let i = 0;
        while (i < 100000) i++;
        return word.length;
    }

    const letterCount = useMemo(() => computeLetterCount(word), [word])

    return (
        <div style={{ padding: '15px' }}>
            <h2>Compute number of letters (slow 🐌)</h2>

            <p>
                "{word}" has {letterCount} letters
            </p>

            <button
                onClick={() => {
                    const next = wordIndex + 1 === words.length ? 0 : wordIndex + 1;
                    setWordIndex(next);
                }}
            >
                Next word
            </button>
            <br />
            <br />
            <h2>Increment a counter (fast ⚡️)</h2>
            <p>Counter: {count}</p>
            <button onClick={() => setCount(count + 1)}>Increment</button>
        </div>
    );
}

export default Example2