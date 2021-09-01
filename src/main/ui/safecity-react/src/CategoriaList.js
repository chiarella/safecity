import React, { Component } from 'react';
import AppNavbar from './AppNavBar';
import { Link } from 'react-router-dom';
import { ButtonGroup, Container, Button, Table } from 'reactstrap';
//import AppNavbar from './AppNavBar';

class CategoriaList extends Component{

    constructor(props){
        super(props)
        this.state = {categorias: []}
        this.remove = this.remove.bind(this);
    }

    componentDidMount(){
        fetch('/categorias')
            .then(response => response.json())
            .then(data => this.setState({categorias: data}));
    }

    async remove(id) {
        window.location.reload(false)

        await fetch(`/categorias/${id}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
           

        }).then(() => {
            let updatedCategorias = [...this.state.categorias].filter(i => i.id !== id);
            this.setState({categorias: updatedCategorias});
        });
        
    }


render() {
    const {categorias} = this.state;

  
    const categoriaList = categorias.map(categoria => {
        return <tr key={categoria.idCategoria}>
            <td style={{whiteSpace: 'nowrap'}}>{categoria.descricaoCategoria}</td>
          
            <td>
                <ButtonGroup>
                    <Button size="sm" color="primary" tag={Link} to={"/categorias/" + categoria.idCategoria}>Edit</Button>
                    <Button size="sm" color="danger" onClick={() => this.remove(categoria.idCategoria)}>Apagar</Button>
                </ButtonGroup>
            </td>
        </tr>
    });

    return (
        <div>
            <AppNavbar/>
            <Container fluid>
                <div className="float-right">
                    <Button color="success" tag={Link} to="/categorias/new">Adicionar Categoria</Button>
                </div>
                <h3>Categoria</h3>
                <Table className="mt-4">
                    <thead>
                    <tr>
                        <th width="30%">Descrição:</th>       
                        <th width="40%">Ações:</th>
                    </tr>
                    </thead>
                    <tbody>
                    {categoriaList}
                    </tbody>
                </Table>
            </Container>
        </div>
    );
}

}

export default CategoriaList;


