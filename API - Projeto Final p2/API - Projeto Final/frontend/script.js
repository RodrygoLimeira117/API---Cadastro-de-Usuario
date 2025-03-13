
const apiUrl = 'http://localhost:8080/usuarios';

function listarUsuarios() {
    fetch(apiUrl)
        .then(res => res.json())
        .then(data => {
            const list = document.getElementById('userList');
            list.innerHTML = '';
            data.forEach(user => {
                const li = document.createElement('li');
                li.innerHTML = `${user.id} - ${user.nome} - ${user.email} <button onclick="deletarUsuario(${user.id})">Deletar</button>`;
                list.appendChild(li);
            });
        });
}

function addUser() {
    const id = document.getElementById('userId').value;
    const nome = document.getElementById('userName').value;
    const email = document.getElementById('userEmail').value;

    const method = id ? 'PUT' : 'POST';
    const url = id ? `${apiUrl}/${id}` : apiUrl;

    fetch(url, {
        method,
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({ nome, email })
    }).then(() => listarUsuarios());
}

function deletarUsuario(id) {
    fetch(`${apiUrl}/${id}`, { method: 'DELETE' })
        .then(() => listarUsuarios());
}

listarUsuarios();
