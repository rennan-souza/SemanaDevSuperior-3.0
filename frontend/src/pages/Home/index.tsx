import { Link } from "react-router-dom";

function Home() {
    return (
        <div><h1>Página Home</h1>
            <Link to="/dashboard">Dash</Link>
        </div>
    );
}

export default Home;